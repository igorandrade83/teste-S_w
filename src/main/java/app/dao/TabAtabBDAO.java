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
@Repository("TabAtabBDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TabAtabBDAO extends JpaRepository<TabAtabB, java.lang.String> {

  /**
   * Obtém a instância de TabAtabB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TabAtabB entity WHERE entity.id = :id")
  public TabAtabB findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de TabAtabB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TabAtabB entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select tt from TabAtabB tt")
  public Page<TabAtabB> list(Pageable pageable);
  

    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM tabC entity WHERE entity.tabAtabB.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<tabC> findTabCGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM tabC entity WHERE entity.tabAtabB.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<tabC> findTabCSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM tabC entity WHERE entity.tabAtabB.id = :id")
  public Page<tabC> findTabC(@Param(value="id") java.lang.String id, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM TabE entity WHERE entity.tabAtabB.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<TabE> findTabEGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM TabE entity WHERE entity.tabAtabB.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<TabE> findTabESpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TabE entity WHERE entity.tabAtabB.id = :id")
  public Page<TabE> findTabE(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key tabA
   * @generated
   */
  @Query("SELECT entity FROM TabAtabB entity WHERE entity.tabA.id = :id")
  public Page<TabAtabB> findTabAtabBsByTabA(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key tabB
   * @generated
   */
  @Query("SELECT entity FROM TabAtabB entity WHERE entity.tabB.id = :id")
  public Page<TabAtabB> findTabAtabBsByTabB(@Param(value="id") java.lang.String id, Pageable pageable);

}
