(ns app.components.reused.button)

(defn button [{:keys [text color]}]
  [:div
   [:a
    {:class (str color " btn navbar-items")}
    text]])