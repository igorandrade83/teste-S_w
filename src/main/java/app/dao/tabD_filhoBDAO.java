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
@Repository("tabD_filhoBDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tabD_filhoBDAO extends JpaRepository<tabD_filhoB, java.lang.String> {

  /**
   * Obtém a instância de tabD_filhoB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tabD_filhoB entity WHERE entity.id = :id")
  public tabD_filhoB findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de tabD_filhoB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tabD_filhoB entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM tabB entity WHERE entity.tabD_filhoB.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<tabB> findTabBGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM tabB entity WHERE entity.tabD_filhoB.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<tabB> findTabBSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM tabB entity WHERE entity.tabD_filhoB.id = :id")
  public Page<tabB> findTabB(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM tabD_filhoB entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<tabD_filhoB> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM tabD_filhoB entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<tabD_filhoB> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
