package co.paulfran.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
    get() = total

    init {
        total.value = startingTotal
    }
//     No longer needed since we are going to observe via live data
//    fun getTotal(): Int {
//        return total
//    }

    fun setTotal(input: Int) {
        total.value = (total.value)?.plus(input)
    }
}