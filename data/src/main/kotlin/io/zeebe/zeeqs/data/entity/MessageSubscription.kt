package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class MessageSubscription(
        @Id val key: Long,
        val messageName: String,
        val messageCorrelationKey: String?,
        val workflowInstanceKey: Long?,
        val elementInstanceKey: Long?,
        val workflowKey: Long?,
        val elementId: String?
) {

    var state: MessageSubscriptionState = MessageSubscriptionState.OPENED
    var timestamp: Long = -1
}