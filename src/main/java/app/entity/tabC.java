package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TABC
 * @generated
 */
@Entity
@Table(name = "\"TABC\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.tabC")
public class tabC implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tabAtabB", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private TabAtabB tabAtabB;

  /**
   * Construtor
   * @generated
   */
  public tabC(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public tabC setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public tabC setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém tabAtabB
   * return tabAtabB
   * @generated
   */
  
  public TabAtabB getTabAtabB(){
    return this.tabAtabB;
  }

  /**
   * Define tabAtabB
   * @param tabAtabB tabAtabB
   * @generated
   */
  public tabC setTabAtabB(TabAtabB tabAtabB){
    this.tabAtabB = tabAtabB;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    tabC object = (tabC)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
