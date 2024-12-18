package com.example.tp1springbach;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<Order,Order> {
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderItemProcessor.class);

    @Override
    public Order process(Order order) throws Exception {
        // Appliquer une remise de 10% sur le montant (amount)
        double discountedAmount = order.amount() * 0.9;

        // Créer une nouvelle instance d'Order avec les valeurs modifiées
        Order transformedOrder = new Order(order.orderId(), order.customerName(), discountedAmount);

        // Log des informations
        LOGGER.info("Processing Order ID: {}, Customer: {}, Original Amount: {}, Discounted Amount: {}",
                order.orderId(), order.customerName(), order.amount(), discountedAmount);

        return transformedOrder;
    }

}
