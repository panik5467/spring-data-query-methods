# spring-data-query-methods

```
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //List<Department> findByName(String name);
    Department findByName(String name);
    Department findTopByName(String name);

    Department findTopByNameAndCodeOrderByIdDesc(String name,String code);

}
```
