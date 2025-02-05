package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TABE
 * @generated
 */
@Entity
@Table(name = "\"TABE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TabE")
public class TabE implements Serializable {

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
  public TabE(){
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
  public TabE setId(java.lang.String id){
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
  public TabE setNome(java.lang.String nome){
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
  public TabE setTabAtabB(TabAtabB tabAtabB){
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
    TabE object = (TabE)obj;
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
