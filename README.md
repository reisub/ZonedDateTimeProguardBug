# ZonedDateTimeProguardBug

A minimal project to show a problem with the ThreeTenABP proguard config

If proguard is enabled, zone information seems to be lost when sending a `ZonedDateTime` object through an `Intent`.
To reproduce compare running the project for debug and release build types.

In debug we send `2016-08-13T12:15Z` and get `2016-08-13T12:15Z`

In release we send `2016-08-13T12:15Z` and get `2016-08-13T12:15null`


Tested on a Nexus 5X running Android Nougat 7.1.1
