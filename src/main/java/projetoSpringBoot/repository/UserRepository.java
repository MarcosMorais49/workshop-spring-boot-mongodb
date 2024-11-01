package projetoSpringBoot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import projetoSpringBoot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}
