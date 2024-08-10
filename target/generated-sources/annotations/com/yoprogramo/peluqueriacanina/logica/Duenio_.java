package com.yoprogramo.peluqueriacanina.logica;

import com.yoprogramo.peluqueriacanina.logica.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-08T01:06:09", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Duenio.class)
public class Duenio_ { 

    public static volatile SingularAttribute<Duenio, String> nombreDuenio;
    public static volatile SingularAttribute<Duenio, String> direccion;
    public static volatile SingularAttribute<Duenio, Integer> dni;
    public static volatile ListAttribute<Duenio, Mascota> listaMascotas;
    public static volatile SingularAttribute<Duenio, Integer> idDuenio;
    public static volatile SingularAttribute<Duenio, String> numeroTelefono;

}