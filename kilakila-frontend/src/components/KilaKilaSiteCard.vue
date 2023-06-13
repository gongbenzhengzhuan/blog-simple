<template>
    <kila-kila-card :icon="['fas', 'tags']" iconColor="#db669f" title="其它网站">
      <div id="look">
        <img src="http://101.37.117.226:9090/wdhcr/%E9%9F%B3%E4%B9%90%E7%BD%91%E7%AB%99" width="160" height="160">
        <br/><br/>
        <a href="http://gongben.top/music/front" target="_blank" rel="nexus">音乐网站</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E8%8B%A5%E4%BE%9D%E7%BD%91%E7%AB%99" width="160" height="160">
        <br/><br/>
        <a href="http://82.156.135.173:20712/ruoyi/front" target="_blank" rel="nexus">若依网站</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E4%B8%AA%E4%BA%BA%E7%BD%91%E7%AB%99" width="160" height="160">
        <br/><br/>
        <a href="http://82.156.135.173:20712/moto/client/front" target="_blank" rel="nexus">个人网站</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E5%BE%AE%E4%BF%A1%E5%85%AC%E4%BC%97%E5%8F%B7" width="160" height="160">
        <br/><br/>
        <a  target="_blank" rel="nexus">微信公众号</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E5%B0%8F%E6%B3%A5%E9%B3%85%E6%B8%B8%E6%88%8F" width="160" height="160">
        <br/><br/>
        <a  target="_blank" rel="nexus">小泥鳅游戏</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E5%BC%80%E5%BF%83%E6%B6%88%E6%B6%88%E4%B9%90" width="160" height="160">
        <br/><br/>
        <a  target="_blank" rel="nexus">开心消消乐</a>
        <br/><br/>
        <a href="http://81.70.71.16:8092/" target="_blank" rel="nexus">数据可视化,账号guest，密码123456</a>
        <br/><br/>
      </div>
    </kila-kila-card>
</template>

<script>

export default {
    name: "KilaKilaSiteCard",
};
</script>

<style scoped>
.tag-clouds {
    font-size: 14px;
    box-sizing: border-box;
}

.tag-item {
    text-decoration: none;
    display: inline-block;
    transition: all 0.4s;
    padding: 0 4px;
    overflow-wrap: break-word;
    line-height: 2;
}

.tag-item:hover {
    color: var(--theme-color) !important;
}

#look {
  text-align: center;
}
</style>