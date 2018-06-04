package com.dhu.action;

import com.dhu.pojo.TbBookinfo;
import com.dhu.service.TbBookinfoService;

import java.util.List;

public class TbBookinfoAction {
    TbBookinfoService tbBookinfoService;
    List<TbBookinfo> tbBookinfos;
    TbBookinfo tbBookinfo;

    public  String list()
    {
        tbBookinfos=tbBookinfoService.list();
        return  "listTbBookinfo";
    }
    public  String add()
    {
        tbBookinfoService.add(tbBookinfo);
        return "listTbBookinfoAction";
    }

    public  String edit()
    {

                tbBookinfo=tbBookinfoService.get(tbBookinfo.getBookid());
                return "editTbBookinfoAction";
    }
    public  String update()
    {
        tbBookinfoService.update(tbBookinfo);
        return "listTbBookinfoAction";
    }

    public TbBookinfoService getTbBookinfoService() {
        return tbBookinfoService;
    }

    public void setTbBookinfoService(TbBookinfoService tbBookinfoService) {
        this.tbBookinfoService = tbBookinfoService;
    }

    public List<TbBookinfo> getTbBookinfos() {
        return tbBookinfos;
    }

    public void setTbBookinfos(List<TbBookinfo> tbBookinfos) {
        this.tbBookinfos = tbBookinfos;
    }

    public TbBookinfo getTbBookinfo() {
        return tbBookinfo;
    }

    public void setTbBookinfo(TbBookinfo tbBookinfo) {
        this.tbBookinfo = tbBookinfo;
    }
}
