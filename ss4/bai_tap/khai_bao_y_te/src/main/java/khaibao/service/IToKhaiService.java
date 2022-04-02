package khaibao.service;

import khaibao.model.ToKhai;

import java.util.List;

public interface IToKhaiService {

    void create( ToKhai toKhai );

    List<ToKhai> list();
}
