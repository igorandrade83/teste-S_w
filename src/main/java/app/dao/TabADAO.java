package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("TabADAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TabADAO extends JpaRepository<TabA, java.lang.String> {

  /**
   * Obtém a instância de TabA utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TabA entity WHERE entity.id = :id")
  public TabA findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de TabA utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TabA entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TabAtabB entity WHERE entity.tabA.id = :id")
  public Page<TabAtabB> findTabAtabB(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.tabB FROM TabAtabB entity WHERE entity.tabA.id = :id AND (entity.tabB.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<tabB> listTabBGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.tabB FROM TabAtabB entity WHERE entity.tabA.id = :id AND (:nome is null OR entity.tabB.nome like concat('%',:nome,'%'))")
  public Page<tabB> listTabBSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tabB FROM TabAtabB entity WHERE entity.tabA.id = :id")
  public Page<tabB> listTabB(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM TabAtabB entity WHERE entity.tabA.id = :instanceId AND entity.tabB.id = :relationId")
  public int deleteTabB(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM TabA entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<TabA> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM TabA entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<TabA> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
