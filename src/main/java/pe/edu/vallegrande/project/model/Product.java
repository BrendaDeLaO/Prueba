package pe.edu.vallegrande.project.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "seleccion_c")
    private Integer seleccion_c;

    @Column(name = "seleccion_u")
    private Integer seleccion_u;

    @Column(name = "seleccion_t")
    private Integer seleccion_t;

    @Column(name = "seleccion_cn")
    private Integer seleccion_cn;

    @Column(name = "seleccion_md")
    private Integer seleccion_md;

    @Column(name = "salida")
    private java.sql.Date salida;


}
