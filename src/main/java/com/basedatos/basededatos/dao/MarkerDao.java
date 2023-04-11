package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.MakerModel;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface MarkerDao {

    List<MakerModel> getAll();
    MakerModel get( long id);
    MakerModel register( MakerModel makerModel);
    MakerModel update( MakerModel makerModel);
    void delete(  long id);
}
