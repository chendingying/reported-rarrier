package com.reported.rarrier.controller.admin;


import com.reported.rarrier.biz.admin.GroupBiz;
import com.reported.rarrier.biz.admin.ResourceAuthorityBiz;
import com.reported.rarrier.constants.CommonConstants;
import com.reported.rarrier.model.admin.Group;
import com.reported.rarrier.util.BaseController;
import com.reported.rarrier.util.ObjectRestResponse;
import com.reported.rarrier.vo.AuthorityMenuTree;
import com.reported.rarrier.vo.GroupTree;
import com.reported.rarrier.vo.GroupUsers;
import com.reported.rarrier.vo.TreeUtil;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-12 8:49
 */
@Controller
@RequestMapping("/api/admin/group")
@Api("群组模块")
public class GroupController extends BaseController<GroupBiz, Group> {
    @Autowired
    private ResourceAuthorityBiz resourceAuthorityBiz;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Group> list(String name,String groupType) throws Exception {
        if(StringUtils.isBlank(name)&& StringUtils.isBlank(groupType)) {
            return new ArrayList<Group>();
        }
        Example example = new Example(Group.class);
        if (StringUtils.isNotBlank(name)) {
            example.createCriteria().andLike("name", "%" + name + "%");
        }
        if (StringUtils.isNotBlank(groupType)) {
            example.createCriteria().andEqualTo("groupType", groupType);
        }

        return baseBiz.selectByExample(example);
    }



    @RequestMapping(value = "/{id}/user", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifiyUsers(@PathVariable int id, String members, String leaders){
        baseBiz.modifyGroupUsers(id, members, leaders);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/user", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<GroupUsers> getUsers(@PathVariable int id){
        return new ObjectRestResponse<GroupUsers>().rel(true).data(baseBiz.getGroupUsers(id));
    }

    @RequestMapping(value = "/{id}/authority/menu", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse modifyMenuAuthority(@PathVariable  int id, String menuTrees){
        String [] menus = menuTrees.split(",");
        baseBiz.modifyAuthorityMenu(id, menus);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/authority/menu", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<List<AuthorityMenuTree>> getMenuAuthority(@PathVariable  int id){
        return new ObjectRestResponse().data(baseBiz.getAuthorityMenu(id)).rel(true);
    }

    @RequestMapping(value = "/{id}/authority/element/add", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse addElementAuthority(@PathVariable  int id, int menuId, int elementId){
        baseBiz.modifyAuthorityElement(id,menuId,elementId);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/authority/element/remove", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse removeElementAuthority(@PathVariable int id, int menuId, int elementId){
        baseBiz.removeAuthorityElement(id,menuId,elementId);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/authority/element", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<List<Integer>> getElementAuthority(@PathVariable  int id){
        return new ObjectRestResponse().data(baseBiz.getAuthorityElement(id)).rel(true);
    }


    @RequestMapping(value = "/tree", method = RequestMethod.GET)
    @ResponseBody
    public List<GroupTree> tree(String name, String groupType) {
        if(StringUtils.isBlank(name)&& StringUtils.isBlank(groupType)) {
            return new ArrayList<GroupTree>();
        }
        Example example = new Example(Group.class);
        if (StringUtils.isNotBlank(name)) {
            example.createCriteria().andLike("name", "%" + name + "%");
        }
        if (StringUtils.isNotBlank(groupType)) {
            example.createCriteria().andEqualTo("groupType", groupType);
        }
        return  getTree(baseBiz.selectByExample(example), CommonConstants.ROOT);
    }


    private List<GroupTree> getTree(List<Group> groups,int root) {
        List<GroupTree> trees = new ArrayList<GroupTree>();
        GroupTree node = null;
        for (Group group : groups) {
            node = new GroupTree();
            node.setLabel(group.getName());
            BeanUtils.copyProperties(group, node);
            trees.add(node);
        }
        return TreeUtil.bulid(trees,root) ;
    }
}
