package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TABATABB
 * @generated
 */
@Entity
@Table(name = "\"TABATABB\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TabAtabB")
public class TabAtabB implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_tabA", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private TabA tabA;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tabB", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private tabB tabB;

  /**
   * Construtor
   * @generated
   */
  public TabAtabB(){
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
  public TabAtabB setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém tabA
   * return tabA
   * @generated
   */
  
  public TabA getTabA(){
    return this.tabA;
  }

  /**
   * Define tabA
   * @param tabA tabA
   * @generated
   */
  public TabAtabB setTabA(TabA tabA){
    this.tabA = tabA;
    return this;
  }

  /**
   * Obtém tabB
   * return tabB
   * @generated
   */
  
  public tabB getTabB(){
    return this.tabB;
  }

  /**
   * Define tabB
   * @param tabB tabB
   * @generated
   */
  public TabAtabB setTabB(tabB tabB){
    this.tabB = tabB;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TabAtabB object = (TabAtabB)obj;
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
