package nianyang.mny.dao;

import java.util.List;

import nianyang.mny.entity.UserDOEs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sikou
 * @date 2021/01/30
 */
@EnableReactiveElasticsearchRepositories
@Mapper
public interface UserDAOEs extends CrudRepository<UserDAOEs,String> {
    List<UserDOEs> getByUserName(String userName);
}
