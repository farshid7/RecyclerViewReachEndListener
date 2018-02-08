# RecyclerViewReachEndListener
How to use:
Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2. Add the dependency

	dependencies {
	        compile 'com.github.farshid7:RecyclerViewReachEndListener:1.0'
	}
    Step 3. Pass recyclerview to labrary
    
RecyclerViewReachEndListener.setEndListener(recyclerView, new RecyclerViewReachEndListener.OnSchoolReachEnd() {
            @Override
            public void OnReachEnd() {
                //recyclerview reach end :)
            }
        });
