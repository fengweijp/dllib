package com.lewuathe.dllib.network

import com.lewuathe.dllib.Model
import com.lewuathe.dllib.form.Form

class Network(val model: Model, val form: Form) extends Serializable {

}

object Network {
  def apply(model: Model, form: Form) = new Network(model, form)
}