package com.mshop.productservice.repository;

import com.mshop.productservice.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	@Query(value = "select * from carts where user_id  = ? ", nativeQuery = true)
	Cart getCartUser(Long id);
	
//	@Modifying
//	@Query(value = "delete from Cart c where c.User.userId:=id ")
//	int deleteByUserId(@Param("id") Long id);
}
