package app.compose_cards.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.compose_cards.model.CreditCardResponse
import app.compose_cards.repository.CreditCardRepository
import kotlinx.coroutines.launch

class CreditCardViewModel : ViewModel() {

    private val repository = CreditCardRepository()
    private val _creditCards = MutableLiveData<CreditCardResponse>()
    val creditCards: LiveData<CreditCardResponse> = _creditCards

    fun fetchCreditCards() {
        viewModelScope.launch {
            try {
                val cards = repository.getCreditCards()
                _creditCards.value = cards
            } catch (e: Exception) {
                Log.e("FetchCreditCards", e.message.toString())
            }
        }
    }
}