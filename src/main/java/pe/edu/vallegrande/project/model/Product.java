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

    @Column(name = "seleccion_0")
    private Integer seleccion_0;

    @Column(name = "seleccion_1")
    private Integer seleccion_1;

    @Column(name = "seleccion_3")
    private Integer seleccion_3;

    @Column(name = "seleccion_5")
    private Integer seleccion_5;

    @Column(name = "seleccion_md")
    private Integer seleccion_md;

    @Column(name = "salida")
    private java.sql.Date salida;


}
