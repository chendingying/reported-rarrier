//package com.reported.rarrier.controller.admin;
//
//
//import com.reported.rarrier.biz.admin.ElementBiz;
//import com.reported.rarrier.biz.admin.UserBiz;
//import com.reported.rarrier.model.admin.Element;
//import com.reported.rarrier.util.BaseController;
//import com.reported.rarrier.util.ObjectRestResponse;
//import com.reported.rarrier.util.TableResultResponse;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import tk.mybatis.mapper.entity.Example;
//
//import java.util.List;
//
///**
// * ${DESCRIPTION}
// *
// * @author wanghaobin
// * @create 2017-06-23 20:30
// */
//@Controller
//@RequestMapping("/api/admin/element")
//public class ElementController extends BaseController<ElementBiz, Element> {
//  @Autowired
//  private UserBiz UsersBiz;
//
//  @RequestMapping(value = "/list", method = RequestMethod.GET)
//  @ResponseBody
//  public TableResultResponse<Element> page(@RequestParam(defaultValue = "10") int limit,
//                                           @RequestParam(defaultValue = "1") int offset, String name, @RequestParam(defaultValue = "0") int menuId) {
//    Example example = new Example(Element.class);
//    Example.Criteria criteria = example.createCriteria();
//    criteria.andEqualTo("menuId", menuId);
//    if(StringUtils.isNotBlank(name)){
//      criteria.andLike("name", "%" + name + "%");
//    }
//    List<Element> elements = baseBiz.selectByExample(example);
//    return new TableResultResponse<Element>(elements.size(), elements);
//  }
//
//  @RequestMapping(value = "/user", method = RequestMethod.GET)
//  @ResponseBody
//  public ObjectRestResponse<Element> getAuthorityElement(String menuId) {
//    int userId = UsersBiz.getUserByUsername(getCurrentUserName()).getId();
//    List<Element> elements = baseBiz.getAuthorityElementByUserId(userId + "",menuId);
//    return new ObjectRestResponse<List<Element>>().data(elements);
//  }
//
//  @RequestMapping(value = "/user/menu", method = RequestMethod.GET)
//  @ResponseBody
//  public ObjectRestResponse<Element> getAuthorityElement() {
//    int userId = UsersBiz.getUserByUsername(getCurrentUserName()).getId();
//    List<Element> elements = baseBiz.getAuthorityElementByUserId(userId + "");
//    return new ObjectRestResponse<List<Element>>().data(elements);
//  }
//}
