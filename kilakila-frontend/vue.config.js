const AutoImport = require('unplugin-auto-import/webpack')
const Components = require('unplugin-vue-components/webpack')
const { ElementPlusResolver } = require('unplugin-vue-components/resolvers')

const path = require('path')

function resolve(dir) {
    return path.join(__dirname, dir)
}


module.exports = {
    configureWebpack: {
        plugins: [
            AutoImport({
                resolvers: [ElementPlusResolver()],
            }),
            Components({
                resolvers: [ElementPlusResolver()],
            }),
        ],
        resolve: {
            alias: {
                '@': resolve('src')
            }
        },
    },
    publicPath: process.env.NODE_ENV === 'production' ? './' : './',
    outputDir: 'dist',
    indexPath: 'index.html',
    lintOnSave: false,
    devServer: {
        proxy: {
            "/image": {
                target: "https://niupic.com/api",
                pathRewrite: { "^/image": "" },
            },
        }
    }
}