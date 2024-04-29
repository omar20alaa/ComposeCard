package app.compose_cards.network

import app.compose_cards.model.CreditCardResponse
import app.compose_cards.utils.AppConstants.CREDIT_CARDS
import retrofit2.http.GET

interface CreditCardService {

    @GET(CREDIT_CARDS)
    suspend fun getCreditCards(): CreditCardResponse


}