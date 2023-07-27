/**
 * 
 */
package com.polarbookshop.orderservice.order.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Gbenga
 *
 */
public interface OrderRepository extends ReactiveCrudRepository<Order,Long> {
}
