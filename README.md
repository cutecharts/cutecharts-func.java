<p align="center">
    <img src="https://user-images.githubusercontent.com/19553554/66697551-27384b00-ed09-11e9-9fe8-210918fdeb77.png" alt="cutecharts.java logo" width=600/>
</p>

<p align=center>
    <i>🎨A hand drawing style charts library in functional Java.</i>
</p>

##  📣 Description

This is a `functional` version of [cutecharts.java](https://github.com/cutecharts/cutecharts.java) which I want try to write `Java` on `non-Java`. :dog:

Definitely, It is more fun to make something has more possibilities.


##  🔖 Documentation

> All the configurations detail you can find on there [chart.xkcd](https://timqian.com/chart.xkcd/).  

<img src=https://user-images.githubusercontent.com/33706142/77919719-1e93fb00-72d0-11ea-8116-e2aa4a89d64a.png />  

## 📝 Useage

> Using the `Functional` stuff, it should be `JDK8` at least.

### Import Dependency
> Maven 
```xml
<dependency>
    <groupId>com.koy</groupId>
    <artifactId>cutecharts-func</artifactId>
    <version>1.0.0</version>
</dependency>
```

> Gradle

```shell
compile group: 'com.koy', name: 'cutecharts-func', version: '1.0.0'
```



### Code Demo

```java
 Chart line = Chart.newChart(ChartType.LINE)
                .setGlobalOptions(
                        GlobalOptions.setTitle("Demo-Line"),
                        GlobalOptions.setXLabel("X-axis Week"),
                        GlobalOptions.setYLabel("Y-axis Amount")
                ).setSeriesOptions(
                        SeriesOptions.setBackgroundColor("orange")
                )
                .setDataLabels(1, 2, 3, 4, 5, 6, 7)
                .setDataSeriesOptions(
                        DataSet.addDataSet("Beer", 1, 2, 3, 4, 2, 5, 4),
                        DataSet.addDataSet("Juice", 1, 4, 7, 4, 1, 3, 2)
                )
                .build();

  RenderExecutor.renderToPath("./").accept(line);
```

![line](https://user-images.githubusercontent.com/33706142/77851369-69980a80-720b-11ea-885b-a39fc54d83d9.png)


## 📃 License

MIT [©Koy](https://github.com/Koooooo-7)

