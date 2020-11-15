def GetAdapterHolder(numViews):
    storeArr = []
    initial = 1
    initial2 = 1
    start = '''
            public static class Ribbon%sHolder extends RecyclerView.ViewHolder {
            private final ArraySet<ImageView> images;
            private static ArrayList<List<ImageView>> oaks = new ArrayList<>();
            '''%(numViews)
    storeArr.append(start)
    for i in range(numViews):
        headerArr = "private final ArraySet<ImageView> oaks%s = new ArraySet<>();\n"%(i+1)
        startMid = "public ImageView mImageView%s;\n"%(i+1)
        storeArr.append(headerArr)
        storeArr.append(startMid)
        for i in range(2,9):
            mid = "public ImageView mImageView%s_%s;\n"%(initial, i)
            storeArr.append(mid)
        initial+=1
    frfrMid = '''
            public Ribbon%sHolder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {\n'''%(numViews)
    itsSoopah = "super(itemView);\n"
    thusisthislul = '''
            this.images = images;
            this.oaks = oaks;
            '''
    storeArr.append(frfrMid)
    storeArr.append(itsSoopah)
    storeArr.append(thusisthislul)
    for i in range(numViews):
        listy = "List<ImageView> oaks%s = new ArrayList<>();\n"%(i+1)
        shlisty = "mImageView%s = itemView.findViewById(R.id.ribbon%s);\n"%(i+1, i+1)
        thisty = "this.images.add(mImageView%s);\n"%(i+1)
        storeArr.append(listy)
        storeArr.append(shlisty)
        storeArr.append(thisty)
        for i in range(2,9):
            holyBuckets = "oaks%s.add(mImageView%s_%s = itemView.findViewById(R.id.ribbon%s_%s));\n"%(initial2, initial2, i, initial2, i)
            storeArr.append(holyBuckets)
        initial2 +=1
    for i in range(numViews):
        add = "oaks.add(oaks%s);\n"%(i+1)
        storeArr.append(add)
    for i in range(numViews):
        clickBUTTUHS = """
                    mImageView%s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ((listener != null)) {
                            int position = getAdapterPosition();
                            int ribbon = mRibbonList.get(position).getImageResource1();
                            if (position != RecyclerView.NO_POSITION) {
                                listener.onEditRibbonClick(ribbon, position);
                            }
                            System.out.println("youclickedme" + ribbon);
                        }
                    }
                });
                """%(i+1)
        storeArr.append(clickBUTTUHS)
    haha = '''
            }
        }
        '''
    storeArr.append(haha) 
    listToStrList = ' '.join([(elem) for elem in storeArr]) 
    print(listToStrList)
    file1 = open("this.txt","w")  
    file1.writelines(listToStrList)

GetAdapterHolder(50)