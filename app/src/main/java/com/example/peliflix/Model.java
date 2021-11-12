package com.example.peliflix;

public class Model {
    String modelname;
    String modeldescripcion;
    String modelgenero;
    int image;


    public Model(String modelname, String modeldescripcion, String modelgenero, int image) {
        this.modelname = modelname;
        this.modeldescripcion = modeldescripcion;
        this.modelgenero = modelgenero;
        this.image = image;
    }


    public String getModelname() {
        return modelname;
    }

    public String getModeldescripcion() {
        return modeldescripcion;
    }

    public String getModelgenero() {
        return modelgenero;
    }

    public int getImage() {
        return image;
    }
}
