<template>
    <kila-kila-card :icon="['fas', 'tags']" iconColor="#db669f" title="其它网站">
      <div>
        <a href="http://gongben.top/music/front" target="_blank" rel="nexus">音乐网站</a>
        <br/><br/>
        <a href="http://82.156.135.173:20712/ruoyi/front" target="_blank" rel="nexus">若依网站</a>
        <br/><br/>
        <a href="http://82.156.135.173:20712/book/front" target="_blank" rel="nexus">书网站</a>
        <br/><br/>
        <a href="http://82.156.135.173:20712/vue-project/front/#/" target="_blank" rel="nexus">个人网站</a>
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
</style>