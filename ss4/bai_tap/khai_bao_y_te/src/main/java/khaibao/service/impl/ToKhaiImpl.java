package khaibao.service.impl;

import khaibao.model.ToKhai;
import khaibao.service.IToKhaiService;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToKhaiImpl implements IToKhaiService {
    private static final List<ToKhai> toKhais = new ArrayList<>();

    static {
        toKhais.add(new ToKhai("Phạm Trần Đăng khoa", "2003", "0", "Việt Nam", "048203000144", "Tàu bay", "AirBus A380", "200", "29/03/2022",
                "01/04/2022", "TT.HUẾ", "TP.Đà Nẵng", "Hòa Vang", "Xã Hòa Châu", "01 Trần Tử Bình ", "0904050607", "khoa.abcxyz@gmail.com"));
    }

    @Override
    public void create(ToKhai toKhai) {

        toKhais.add(toKhai);
    }

    @Override
    public List<ToKhai> list() {
        return toKhais;
    }
}
