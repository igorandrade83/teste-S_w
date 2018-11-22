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
@Repository("tabCDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tabCDAO extends JpaRepository<tabC, java.lang.String> {

  /**
   * Obtém a instância de tabC utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tabC entity WHERE entity.id = :id")
  public tabC findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de tabC utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tabC entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM tabC entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<tabC> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM tabC entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<tabC> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key tabAtabB
   * @generated
   */
  @Query("SELECT entity FROM tabC entity WHERE entity.tabAtabB.id = :id")
  public Page<tabC> findtabCsByTabAtabB(@Param(value="id") java.lang.String id, Pageable pageable);

}
