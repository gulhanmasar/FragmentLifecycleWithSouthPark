# FragmentLifecycleWithSouthPark

## onSaveInstanceState nedir?

onSaveInstanceState metodu içerisinde bu şekilde kaybolan değerler Bundle tipindeki parametreye alınarak koruma altına alınır.

```javascript
override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        //Get textView message.
        val textViewMessage = binding.textView.text.toString()

        //Save textview message in bundle.
        outState.putString(Key.NAME, textViewMessage)

    }

```




## onViewStateRestored nedir?

Tüm kaydedilen durum, parçanın görünüm hiyerarşisine geri yüklendiğinde çağrılır. Bu, onay kutusu pencere öğelerinin şu anda işaretli olup olmadığı gibi, görünüm hiyerarşisinin kendisini izlemesine izin verdiğiniz kaydedilmiş duruma dayalı olarak başlatma yapmak için kullanılabilir. Bu, onActivityCreated(android.os.Bundle)'dan sonra ve onStart()'tan önce çağrılır.

```javascript
override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        //If saved instance is not null
        savedInstanceState?.let {

            //Get bundle content.
            val content = it.getString(Key.NAME, "a")

            //Set textview.
            binding.textView.text = content
        }
    }
```

https://user-images.githubusercontent.com/109763090/189500068-06e72880-851f-4924-bc5a-7e1fec9573eb.mov


