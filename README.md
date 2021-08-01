
AlbumView is part of Assignment sample code

**#Functionality inside Application:**
1. Album List can be shown on view , the list is sorted
2. Album List are avaialble on offline mode also.

#**Technology Stack Used for the Application:**

1. Kotlin as primary development language
2. MVVM Architecure
3. Jetpack Component (ViewModel,View Binding, LiveData,Room Database)
4. Retrofit for Network Communication
5. Koin (Kotlin DI framwork for Dependenacy Injection)
6. Kotlin Coroutine for MultiThreading
7. JUnit and Mockito For Unit Test cases and Expresso for Instrumentation

#**Approach for this Application Developement**
  The main functional requirement for the app is to call the Album API and show the sorted list having offline support.
For creation of this app , I have used the MVVM architecture with the help of latest Jetpack Compenent.
I have used the latest KOIN library for Dependency Injection as the KOIN is lightweight DI framework and Kotlin specific also much easy to use. 
For the performance perspecive, I have sort the incoming album list on background thread and for that use Kotlin's Flow. So all the sorting logic run on IO thread and sorting logic on UI thread to avoid the UI blocking.
For the security purpose , I keep the API URL in build config in the the form BASE 64 encoded by writting Extention Function for String encoding.
There are total 4 layer of app structure.
1. Core Layer :
  This layer contain the Core re-usable component for Activity and View Model. I have created the core classes which can extend by the any activity or viewmodel use in future .     This e layer class are generic one so that any component can extend that.
2.Data Layer :
  This layer having all data related classes like Model Classes , Database classes ,API helper claases .
3. Domain :
    This layer contrain mainly DI related classed and Repository components.
4 Presentation Layer :
  This layer mainly deals with the Appliation UI like ViewModel,Activity, Adapter classes .

#**Future Improvement or Enhancement** :
1. We can add more detail for Album list like detail and album images . 
2. For performance perspective, we can use local caching also with room database so that even network is ON we dont have to call API evrytime it can take it from our local cache.
3. For app security , I have already keep the URL as encoded string in Buid config file . We can covert all the URL like this way .
4. For Efficient scrolling of large number of data set , we can use DiffUtil for recyclerview and also Jetpack Paging for Pagination for loading large amount of data .
5. We can make more resuable component , which can be used by our general component like in this app I have used Core classed for Activity and ViewModel So in same way we can write the core claases for our recycler view adapter.

7. For Secuirty purpose , we can make API call more secure by applying 
