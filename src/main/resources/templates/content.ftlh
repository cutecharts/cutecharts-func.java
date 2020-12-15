<#macro content >
    <div id="${chart.chartId }" class="chart-container" style="height:${chart.height} ;width:${chart.width}">
        <svg id="chart_${chart.chartId}"></svg>
    </div>
    <script>
        const svg_${chart.chartId} = document.querySelector('#chart_${chart.chartId}')
        const chart_${chart.chartId} = new chartXkcd.${chart.chartType}(svg_${chart.chartId}, ${data});

        <#if chart.options.fillColor>
        let color = ['#dd4528', '#28a3dd', '#f3db52', '#ed84b5', '#4ab74e', '#9179c0', '#8e6d5a', '#f19839', '#949494']
            <#if chart.options.dataColors?? >
            color = []
                <#list chart.options.dataColors as cs>
                color.push("${cs}")
                </#list>
        </#if>
            document.querySelectorAll(".xkcd-chart-bar").forEach((it, idx) => {
                it.setAttribute("fill", color[idx])
                it.addEventListener("mouseout", () => {
                    document.querySelectorAll(".xkcd-chart-bar").forEach((it, idx) => {
                        it.setAttribute("fill", color[idx])
                    })
                })
            })
        </#if>
    </script>
</#macro>