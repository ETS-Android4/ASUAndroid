
#Case2:

def GetXMLCase2(n):
    z = 5
    storeArr = []
    numRows = n // 3
    print(numRows)
    for i in range(numRows):
        this = '''
                <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+1, z, z-2)
        that = '''
                <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+2, z+1, z-1)
        theOther ='''        
                    <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toStartOf="%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                    '''%(z+3, "parent", z)
        z+=3
        storeArr.append(this)
        storeArr.append(that)
        storeArr.append(theOther)
    for i in range(4):
        del storeArr[-1]

    for i in range(1):
        listToStrList = ' '.join([(elem) for elem in storeArr]) 
        listToStr = ' '.join([(elem) for elem in storeArr]) 
        outPut = '''
                <ImageView
                    android:id="@+id/ribbon1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintHorizontal_bias="0.0"
                    app:layout_constraintStart_toEndOf="@+id/ribbon2"
                    app:layout_constraintTop_toTopOf="parent"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

                <ImageView
                    android:id="@+id/ribbon2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon5"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

                <ImageView
                    android:id="@+id/ribbon3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon2"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

                <ImageView
                    android:id="@+id/ribbon4"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon3"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

                <ImageView
                    android:id="@+id/ribbon5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon2"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
            %s
            '''%(listToStr)
        final = '''
        <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/ribbonRack"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@android:color/transparent"
            android:orientation="vertical">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true">
            %s
            </androidx.constraintlayout.widget.ConstraintLayout>

        </RelativeLayout>'''%(outPut)
    print(final)



def GetXMLCase3(n):
    z = 5
    storeArr = []
    numRows = n // 3
    print(numRows)
    for i in range(numRows):
        this = '''
                <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+2, z+1, z-1)
        that = '''
                <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+3, z+2, z)
        theOther ='''        
                    <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toStartOf="%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                    '''%(z+1, "parent", z-2)
        z+=3
        storeArr.append(theOther)
        storeArr.append(this)
        storeArr.append(that)
    for i in range(3):
        del storeArr[-1]

    for i in range(1):
        listToStrList = ' '.join([(elem) for elem in storeArr]) 
        listToStr = ' '.join([(elem) for elem in storeArr]) 
        outPut = '''
        <ImageView
            android:id="@+id/ribbon1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="66dp"
            android:layout_marginLeft="66dp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

        <ImageView
            android:id="@+id/ribbon2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginEnd="66dp"
            android:layout_marginRight="66dp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

        <ImageView
            android:id="@+id/ribbon3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/ribbon1"
            app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

        <ImageView
            android:id="@+id/ribbon4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintStart_toEndOf="@+id/ribbon3"
            app:layout_constraintTop_toBottomOf="@+id/ribbon2"
            app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

        <ImageView
            android:id="@+id/ribbon5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@+id/ribbon4"
            app:layout_constraintTop_toBottomOf="@+id/ribbon2"
            app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
            %s
            '''%(listToStr)
        final = '''
        <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/ribbonRack"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@android:color/transparent"
            android:orientation="vertical">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true">
            %s
            </androidx.constraintlayout.widget.ConstraintLayout>

        </RelativeLayout>'''%(outPut)
    print(final)

#Case 1
def GetXMLCase1(n):
    z = 5
    storeArr = []
    numRows = n // 3
    print(numRows)
    for i in range(numRows):
        this = '''
                <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+1, z, z-2)
        that = '''
                <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toStartOf="%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+2, "parent", z-1)
        theOther ='''        
                    <ImageView
                    android:id="@+id/ribbon%s"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                    app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                    app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                    '''%(z+3, z+2, z)
        z+=3
        storeArr.append(this)
        storeArr.append(that)
        storeArr.append(theOther)
    for i in range(5):
        del storeArr[-1]

    for i in range(1):
        listToStrList = ' '.join([(elem) for elem in storeArr]) 
        listToStr = ' '.join([(elem) for elem in storeArr]) 
        outPut = '''
            <ImageView
                android:id="@+id/ribbon1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintStart_toEndOf="@+id/ribbon1"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintStart_toEndOf="@+id/ribbon2"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon5"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintStart_toEndOf="@+id/ribbon1"
                app:layout_constraintTop_toBottomOf="@+id/ribbon2"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
            %s
            '''%(listToStr)
        final = '''
        <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/ribbonRack"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@android:color/transparent"
            android:orientation="vertical">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true">
            %s
            </androidx.constraintlayout.widget.ConstraintLayout>

        </RelativeLayout>'''%(outPut)
    print(final)


#GetXMLCase1(48)
#GetXMLCase2(49)
GetXMLCase3(50)





