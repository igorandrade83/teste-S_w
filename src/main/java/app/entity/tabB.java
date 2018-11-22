package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TABB
 * @generated
 */
@Entity
@Table(name = "\"TABB\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.tabB")
public class tabB implements Serializable {

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
  @JoinColumn(name="fk_tabD_filhoB", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private tabD_filhoB tabD_filhoB;

  /**
   * Construtor
   * @generated
   */
  public tabB(){
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
  public tabB setId(java.lang.String id){
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
  public tabB setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém tabD_filhoB
   * return tabD_filhoB
   * @generated
   */
  
  public tabD_filhoB getTabD_filhoB(){
    return this.tabD_filhoB;
  }

  /**
   * Define tabD_filhoB
   * @param tabD_filhoB tabD_filhoB
   * @generated
   */
  public tabB setTabD_filhoB(tabD_filhoB tabD_filhoB){
    this.tabD_filhoB = tabD_filhoB;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    tabB object = (tabB)obj;
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
