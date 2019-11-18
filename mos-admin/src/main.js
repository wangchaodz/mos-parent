import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import ElementUI from 'element-ui'
import VueI18n from 'vue-i18n'
import enLocale from 'element-ui/lib/locale/lang/en'
import zhLocale from 'element-ui/lib/locale/lang/zh-CN'
import 'element-ui/lib/theme-chalk/index.css'

Vue.config.productionTip = false
Vue.use(VueI18n)

const messages = {
  en: {
    // 或者用 Object.assign({ message: 'hello' }, enLocale)
    message: 'hello',
    ...enLocale
  },
  zh: {
    // 或者用 Object.assign({ message: '你好' }, zhLocale)
    message: '你好',
    ...zhLocale
  }
}
// Create VueI18n instance with options
const i18n = new VueI18n({
  // set locale
  locale: 'en',
  // set locale messages
  messages,
})

Vue.use(ElementUI, {
  i18n: (key, value) => i18n.t(key, value)
})

new Vue({
  i18n,
  router,
  render: h => h(App)
}).$mount('#app')
