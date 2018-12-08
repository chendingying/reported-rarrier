package com.reported.rarrier.controller.ensure;

import com.reported.rarrier.biz.ensure.EquipNameBiz;
import com.reported.rarrier.model.ensure.EquipName;
import com.reported.rarrier.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CDZ on 2018/12/8.
 */
@RestController
@RequestMapping("/api/ensure/equipName")
public class EquipNameController extends BaseController<EquipNameBiz,EquipName> {
}
