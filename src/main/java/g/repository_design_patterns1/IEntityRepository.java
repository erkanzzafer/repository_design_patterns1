/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package g.repository_design_patterns1;

/**
 *
 * @author zafer
 */
public interface IEntityRepository<T extends IEntity> {

    void add(T entity);

    void delete(T entity);

    void update(T entity);

}
