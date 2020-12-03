#Case2:
def GetXMLCase1(n):
    z = 3
    storeArr = []
    numRows = n // 3
    print(numRows)
    for i in range(numRows):
        this = '''
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="1.0"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+1, z-1, z-2)
        that = '''
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toStartOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.0"
                app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:layout_constraintVertical_bias="0.0"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+2, z+3, z+1, z-1)
        theOther ='''        
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="1.0"
                app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                    '''%(z+3, z-1, z)
        z+=3
        storeArr.append(this)
        storeArr.append(that)
        storeArr.append(theOther)
    for i in range(3):
        del storeArr[-1]
    a = 1
    for i in range(n):
        xml = '''
            <ImageView
                android:id="@+id/ribbon%s_2"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_3"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_11sdp"
                android:layout_marginLeft="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_4"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_11sdp"
                android:layout_marginRight="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_5"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_22sdp"
                android:layout_marginRight="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.555" />

            <ImageView
                android:id="@+id/ribbon%s_6"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_22sdp"
                android:layout_marginLeft="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_7"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_33sdp"
                android:layout_marginLeft="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias=".50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_8"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_33sdp"
                android:layout_marginRight="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.50" />
                    '''%(a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a)
        a+=1
        storeArr.append(xml)

    for i in range(1):
        listToStrList = ' '.join([(elem) for elem in storeArr]) 
        listToStr = ' '.join([(elem) for elem in storeArr]) 
        outPut = '''
            <ImageView
                android:id="@+id/ribbon1"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon2"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon2"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon3"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon1"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon3"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon2"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
            %s
            '''%(listToStr)
        final = '''
            <?xml version="1.0" encoding="utf-8"?>
            <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
                xmlns:app="http://schemas.android.com/apk/res-auto"
                xmlns:tools="http://schemas.android.com/tools"
                android:id="@+id/ribbonRack"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@android:color/transparent"
                android:orientation="vertical"
                app:layout_constraintHorizontal_chainStyle="packed">
            %s
            </androidx.constraintlayout.widget.ConstraintLayout>'''%(outPut)

        file1 = open("this.txt","a")  
        file1.writelines(final)
    print(final)

def GetXMLCase2(n):
    z = 4
    storeArr = []
    numRows = n // 3
    print(numRows)
    for i in range(numRows):
        this = '''
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+1, z+2, z-2)
        that = '''
        <ImageView
            android:id="@+id/ribbon%s"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:adjustViewBounds="true"
            android:scaleType="fitXY"
            app:layout_constraintEnd_toStartOf="@+id/ribbon%s"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toEndOf="@+id/ribbon%s"
            app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
            app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+2, z+3, z+1, z-1)
        theOther ='''        
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                    '''%(z+3, z+2, z)
        z+=3
        storeArr.append(this)
        storeArr.append(that)
        storeArr.append(theOther)
    for i in range(3):
        del storeArr[-1]
    
    a = 1
    for i in range(n):
        xml = '''
            <ImageView
                android:id="@+id/ribbon%s_2"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_3"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_11sdp"
                android:layout_marginLeft="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_4"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_11sdp"
                android:layout_marginRight="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_5"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_22sdp"
                android:layout_marginRight="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.555" />

            <ImageView
                android:id="@+id/ribbon%s_6"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_22sdp"
                android:layout_marginLeft="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_7"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_33sdp"
                android:layout_marginLeft="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias=".50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_8"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_33sdp"
                android:layout_marginRight="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.50" />
                    '''%(a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a)
        a+=1
        storeArr.append(xml)

    for i in range(1):
        listToStrList = ' '.join([(elem) for elem in storeArr]) 
        listToStr = ' '.join([(elem) for elem in storeArr]) 
        outPut = '''
            <ImageView
                android:id="@+id/placeholder1"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:background="@android:color/transparent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon1"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@android:color/transparent" />

            <ImageView
                android:id="@+id/placeholder2"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon1"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon1"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/placeholder1"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/placeholder2"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon2"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon3"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon3"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon4"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon2"
                app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon4"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon3"
                app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
            %s
            '''%(listToStr)
        final = '''
        <?xml version="1.0" encoding="utf-8"?>
        <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/ribbonRack"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@android:color/transparent"
            android:orientation="vertical"
            app:layout_constraintHorizontal_chainStyle="packed">
            %s
            </androidx.constraintlayout.widget.ConstraintLayout>'''%(outPut)
        file1 = open("this.txt","a")  
        file1.writelines(final)
    print(final)

#Case 1
def GetXMLCase3(n):
    z = 3
    storeArr = []
    numRows = n // 3
    print(numRows)
    for i in range(numRows):
        this = '''
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+3, z+4, z)
        that = '''
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                '''%(z+4, z+5, z+3, z+1)
        theOther ='''        
            <ImageView
                android:id="@+id/ribbon%s"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon%s"
                app:layout_constraintTop_toBottomOf="@+id/ribbon%s"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
                    '''%(z+5, z+4, z+2)
        z+=3
        storeArr.append(this)
        storeArr.append(that)
        storeArr.append(theOther)
    for i in range(3):
        del storeArr[-1]
        z=1
    a = 1
    for i in range(n):
        xml = '''
            <ImageView
                android:id="@+id/ribbon%s_2"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_3"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_11sdp"
                android:layout_marginLeft="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_4"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_11sdp"
                android:layout_marginRight="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_5"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_22sdp"
                android:layout_marginRight="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.555" />

            <ImageView
                android:id="@+id/ribbon%s_6"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_22sdp"
                android:layout_marginLeft="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_7"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_33sdp"
                android:layout_marginLeft="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias=".50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_8"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_33sdp"
                android:layout_marginRight="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.50" />
                    '''%(a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a)
        a+=1
        storeArr.append(xml)
    for i in range(1):
        listToStrList = ' '.join([(elem) for elem in storeArr]) 
        listToStr = ' '.join([(elem) for elem in storeArr]) 
        outPut = '''
            <ImageView
                android:id="@+id/ribbon1"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon2"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/imageView4"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon2"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/imageView5"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon1"
                app:layout_constraintTop_toTopOf="parent"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon3"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon4"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/ribbon1"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon4"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toStartOf="@+id/ribbon5"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon3"
                app:layout_constraintTop_toBottomOf="@+id/ribbon2"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />

            <ImageView
                android:id="@+id/ribbon5"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:adjustViewBounds="true"
                android:scaleType="fitXY"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon4"
                app:layout_constraintTop_toBottomOf="@+id/ribbon2"
                app:srcCompat="@drawable/ic_afghanistan_campaign_medal_ribbon" />
            %s
            '''%(listToStr)
        final = '''
        <?xml version="1.0" encoding="utf-8"?>
        <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/ribbonRack"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@android:color/transparent"
            android:orientation="vertical"
            app:layout_constraintHorizontal_chainStyle="packed">

            <ImageView
                android:id="@+id/imageView4"
                android:layout_width="@dimen/_50sdp"
                android:layout_height="0dp"
                android:background="@android:color/transparent"
                app:layout_constraintEnd_toStartOf="@+id/ribbon1"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                tools:srcCompat="@tools:sample/avatars" />

            <ImageView
                android:id="@+id/imageView5"
                android:layout_width="@dimen/_50sdp"
                android:layout_height="0dp"
                android:background="@android:color/transparent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.5"
                app:layout_constraintStart_toEndOf="@+id/ribbon2"
                app:layout_constraintTop_toTopOf="parent"
                tools:srcCompat="@tools:sample/avatars" />
            %s
            </androidx.constraintlayout.widget.ConstraintLayout>
        '''%(outPut)
    file1 = open("this.txt","w")  
    file1.writelines(final)
    print(final)

#GetXMLCase1(3)
#GetXMLCase2(1)
#GetXMLCase3(2)





