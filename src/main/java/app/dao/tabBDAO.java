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
@Repository("tabBDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tabBDAO extends JpaRepository<tabB, java.lang.String> {

  /**
   * Obtém a instância de tabB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tabB entity WHERE entity.id = :id")
  public tabB findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de tabB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tabB entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TabAtabB entity WHERE entity.tabB.id = :id")
  public Page<TabAtabB> findTabAtabB(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.tabA FROM TabAtabB entity WHERE entity.tabB.id = :id AND (entity.tabA.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<TabA> listTabAGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.tabA FROM TabAtabB entity WHERE entity.tabB.id = :id AND (:nome is null OR entity.tabA.nome like concat('%',:nome,'%'))")
  public Page<TabA> listTabASpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tabA FROM TabAtabB entity WHERE entity.tabB.id = :id")
  public Page<TabA> listTabA(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM TabAtabB entity WHERE entity.tabB.id = :instanceId AND entity.tabA.id = :relationId")
  public int deleteTabA(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM tabB entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<tabB> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM tabB entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<tabB> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key tabD_filhoB
   * @generated
   */
  @Query("SELECT entity FROM tabB entity WHERE entity.tabD_filhoB.id = :id")
  public Page<tabB> findtabBsByTabD_filhoB(@Param(value="id") java.lang.String id, Pageable pageable);

}
