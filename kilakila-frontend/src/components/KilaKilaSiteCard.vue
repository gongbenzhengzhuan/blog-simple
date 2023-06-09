<template>
    <kila-kila-card :icon="['fas', 'tags']" iconColor="#db669f" title="其它网站">
      <div id="look">
        <img src="http://101.37.117.226:9090/wdhcr/%E9%9F%B3%E4%B9%90%E7%BD%91%E7%AB%99?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=7v3qUvGaLweXRbw4%2F20230605%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230605T010621Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=42aab690099ef6385331495fc1550e98caf5cbff066dadbc4d6d527f868ef6a6" width="160" height="160">
        <br/><br/>
        <a href="http://gongben.top/music/front" target="_blank" rel="nexus">音乐网站</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E8%8B%A5%E4%BE%9D%E7%BD%91%E7%AB%99?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=7v3qUvGaLweXRbw4%2F20230605%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230605T010524Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=270130c1a80aaa0aec5c139d856e75da16115e8736a790aa22d9bb8d8d701002" width="160" height="160">
        <br/><br/>
        <a href="http://82.156.135.173:20712/ruoyi/front" target="_blank" rel="nexus">若依网站</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E4%B8%AA%E4%BA%BA%E7%BD%91%E7%AB%99?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=7v3qUvGaLweXRbw4%2F20230608%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230608T114055Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=0d209ddfa89aa96ed8eedde36a54ee4d4f39ae40de880350351c1cf76c9bd086" width="160" height="160">
        <br/><br/>
        <a href="http://82.156.135.173:20712/moto/client/front" target="_blank" rel="nexus">个人网站</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E5%BE%AE%E4%BF%A1%E5%85%AC%E4%BC%97%E5%8F%B7?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=7v3qUvGaLweXRbw4%2F20230605%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230605T012712Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=54d4d729c7ab164ab5aeb44aba25f46cac6157c32c4b94b189be0add2915a184" width="160" height="160">
        <br/><br/>
        <a  target="_blank" rel="nexus">微信公众号</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E5%B0%8F%E6%B3%A5%E9%B3%85%E6%B8%B8%E6%88%8F?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=7v3qUvGaLweXRbw4%2F20230605%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230605T003217Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=95f72e6bd100ee909f7050a95af0129d203c467611d9c0ea3dd1e0fc3ad5e799" width="160" height="160">
        <br/><br/>
        <a  target="_blank" rel="nexus">小泥鳅游戏</a>
        <br/><br/>
        <br/><br/>
        <img src="http://101.37.117.226:9090/wdhcr/%E5%BC%80%E5%BF%83%E6%B6%88%E6%B6%88%E4%B9%90?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=7v3qUvGaLweXRbw4%2F20230606%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230606T100633Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=c114a7996be344682074008eae52f0386187485ed729997ee20035e42b66d655" width="160" height="160">
        <br/><br/>
        <a  target="_blank" rel="nexus">开心消消乐</a>
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