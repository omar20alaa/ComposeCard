package app.compose_cards.repository

import app.compose_cards.model.CreditCardResponse
import app.compose_cards.network.RetrofitInstance

class CreditCardRepository {

    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): CreditCardResponse {
        return creditCardService.getCreditCards()
    }

}