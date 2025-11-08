package pertemuan_12;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pertemuan_12.Kendaraan;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T11:23:12", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pemilik.class)
public class Pemilik_ { 

    public static volatile SingularAttribute<Pemilik, String> idPemilik;
    public static volatile SingularAttribute<Pemilik, String> noHp;
    public static volatile SingularAttribute<Pemilik, String> namaPemilik;
    public static volatile CollectionAttribute<Pemilik, Kendaraan> kendaraanCollection;
    public static volatile SingularAttribute<Pemilik, String> alamat;

}