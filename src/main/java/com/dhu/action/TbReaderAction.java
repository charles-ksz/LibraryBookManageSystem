package com.dhu.action;
import com.dhu.pojo.TbReader;
import com.dhu.service.TbReaderService;
import java.util.List;
public class TbReaderAction {
    TbReaderService tbreaderService;
    List<TbReader> tbreaders;
    TbReader tbreader;
    public String list() {
        tbreaders = tbreaderService.list();
        return "listTbReader";
    }

    public String add(){
        tbreaderService.add(tbreader);
        return "listTbReaderAction";
    }
    public String edit(){
        tbreader = tbreaderService.get(tbreader.getName());
        return "editTbReader";
    }
    public String delete(){
        tbreaderService.delete(tbreader);
        return "listTbReaderAction";
    }
    public String update(){
        tbreaderService.update(tbreader);
        return "listTbReaderAction";
    }

    public TbReaderService getTbReaderService() {
        return tbreaderService;
    }

    public void setTbReaderService(TbReaderService tbreaderService) {
        this.tbreaderService = tbreaderService;
    }

    public List<TbReader> getTbReaders() {
        return tbreaders;
    }

    public void setTbReaders(List<TbReader> tbreaders) {
        this.tbreaders = tbreaders;
    }

    public TbReader getTbReader() {
        return tbreader;
    }

    public void setTbReader(TbReader tbreader) {
        this.tbreader = tbreader;
    }
}
