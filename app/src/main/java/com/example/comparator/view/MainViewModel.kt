import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.comparator.model.Comparator

class MainViewModel : ViewModel() {

    private val _textComparisonResult = MutableLiveData<String>()
    val textComparisonResult: LiveData<String>
        get() = _textComparisonResult

    fun compareTexts(text1: String, text2: String) {
        if (text1 == text2) {
            _textComparisonResult.value = "Los textos son iguales"
        } else {
            _textComparisonResult.value = "Los textos son diferentes"
        }
    }
}