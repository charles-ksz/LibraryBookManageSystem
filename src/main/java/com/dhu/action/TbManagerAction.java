package com.dhu.action;

import  com.dhu.pojo.TbManager;
import  com.dhu.service.TbManagerService;


import java.util.List;

public class TbManagerAction {
    TbManagerService tbManagerService;
    TbManager tbManager;
    List<TbManager> tbManagers;

    public TbManagerService getTbManagerService() {
        return tbManagerService;
    }

    public void setTbManagerService(TbManagerService tbManagerService) {
        this.tbManagerService = tbManagerService;
    }

    public TbManager getTbManager() {
        return tbManager;
    }

    public void setTbManager(TbManager tbManager) {
        this.tbManager = tbManager;
    }

    public List<TbManager> getTbManagers() {
        return tbManagers;
    }

    public void setTbManagers(List<TbManager> tbManagers) {
        this.tbManagers = tbManagers;
    }

    public  String add()
    {
        tbManagerService.add(tbManager);
        return "listTbManagerAction";
    }

    public  String delete()
    {
        tbManagerService.delete(tbManager);
        return "listTbManagerAction";
    }

    public  String edit()
    {
        tbManager=tbManagerService.get(tbManager.getName());
        return "editTbManager";
    }

    public String update()
    {
        tbManagerService.update(tbManager);
        return "listTbManagerAction";
    }


    public String list()
    {
        tbManagers=tbManagerService.list();
        return "listTbManager";
    }
}
