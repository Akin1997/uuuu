package com.stripe.android.model

import kotlinx.parcelize.Parcelize

/**
 * [WeChat Pay Payments with Sources](https://stripe.com/docs/sources/wechat-pay)
 */
@Parcelize
data class WeChat internal constructor(
    val statementDescriptor: String? = null,
    val appId: String?,
    val nonce: String?,
    val packageValue: String?,
    val partnerId: String?,
    val prepayId: String?,
    val sign: String?,
    val timestamp: String?,
    val qrCodeUrl: String? = null
) : StripeModel
