package com.juicebox.straw.resource

import com.juicebox.straw.model.Order
import net.minidev.json.JSONObject
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class OrderController {

    @MessageMapping("/order/status")
    @SendTo("/order_broker/status")
    fun getStatusOder(order: Order): Map<String,String> {
        return mapOf("data" to "my status is: ${order.name}")
    }
}