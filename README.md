# TestList
just for test
----------------
1.RecyclerView

2.Http post get del set

3.RxJava

4.touch dispatch event

5.javassist modify R.java

6.增加pull to refresh

7.增加类似网易新闻页面

8.ImageLoader:https://cube-sdk.liaohuqiu.net/cn/imageloader/

9.集成sliding 类似于微信的下拉功能，也可以通过PTR来实现，自定义header（和PTR的实现原理不一样，PTR通过layout来布局header和内容；而sliding通过设置view的属性来达到设置偏移）

10.增加swipe listview，原理是通多代理adapter修改getview方法，嵌入需要的menu，然后重写listview里面的事件处理(自定义了一个swipeMenuLayout继承于FrameLayout，重写computeScroll修改子view的layout，达到滑动的目的)

11.增加仿QQ拖拽view；实现原理：集成textview，获取activity的rootview，然后拖拽的时候拷贝一个拖拽view，根据event 坐标设置view的坐标；同是update springview 来实现粘性的效果

12.集成fresco demo,能够解决图片load，内存分配回收，在大量图片list的case中会用到，原理及使用方法：https://www.fresco-cn.org/docs/index.html;https://www.jianshu.com/p/265c628a0d59
