(ns app.core
  (:require [reagent.dom :as rdom]
            [reagent.core :as r]
            [app.components.heaer :refer [header]]
            [app.components.home :refer [home]]
            [app.components.trusted-comp :refer [trusted-comp]]))


(defn app-container []
  [:<>
   [header]
   [home]
   [trusted-comp]])


(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (rdom/render [app-container]
               (.getElementById js/document "app")))


(defn main []
  (js/console.log "MAIN FN Reloaded")
  (render))